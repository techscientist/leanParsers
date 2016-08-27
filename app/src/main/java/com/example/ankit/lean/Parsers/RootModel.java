import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String description;
	public String timezone;
	public VersionModel _version;
	public CreatorModel _creator;
	public String end_time;
	public String logo;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_name;
	public String email;
	public String state;
	public String type;
	public String privacy;
	public String background_image;
	public String name;
	public String code_of_conduct;
	public String location_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String topic;
	public String start_time;

	public RootModel(Call_for_papersModel call_for_papers, String description, String timezone, VersionModel version, CreatorModel creator, String end_time, String logo, CopyrightModel copyright, String schedule_published_on, String organizer_name, String email, String state, String type, String privacy, String background_image, String name, String code_of_conduct, String location_name, int id, ArrayList<Social_linksModel> social_links, String organizer_description, String topic, String start_time) {

		this._call_for_papers = call_for_papers;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this._creator = creator;
		this.end_time = end_time;
		this.logo = logo;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.email = email;
		this.state = state;
		this.type = type;
		this.privacy = privacy;
		this.background_image = background_image;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.id = id;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.start_time = start_time;

	}

}