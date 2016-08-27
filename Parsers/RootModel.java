import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String email;
	public String location_name;
	public String description;
	public VersionModel _version;
	public String timezone;
	public String background_image;
	public String start_time;
	public String code_of_conduct;
	public String organizer_name;
	public String state;
	public String logo;
	public String privacy;
	public int id;
	public String topic;
	public String schedule_published_on;
	public String type;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;

	public RootModel(Call_for_papersModel call_for_papers, String end_time, String email, String location_name, String description, VersionModel version, String timezone, String background_image, String start_time, String code_of_conduct, String organizer_name, String state, String logo, String privacy, int id, String topic, String schedule_published_on, String type, String organizer_description, ArrayList<Social_linksModel> social_links, String name, CreatorModel creator, CopyrightModel copyright) {

		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.email = email;
		this.location_name = location_name;
		this.description = description;
		this._version = version;
		this.timezone = timezone;
		this.background_image = background_image;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.state = state;
		this.logo = logo;
		this.privacy = privacy;
		this.id = id;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.name = name;
		this._creator = creator;
		this._copyright = copyright;

	}

}