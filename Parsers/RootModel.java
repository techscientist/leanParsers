import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String timezone;
	public String schedule_published_on;
	public String type;
	public String email;
	public String privacy;
	public String location_name;
	public String logo;
	public String code_of_conduct;
	public int id;
	public VersionModel _version;
	public String state;
	public String organizer_description;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public CreatorModel _creator;
	public String start_time;
	public String end_time;
	public String organizer_name;
	public String background_image;
	public String name;

	public RootModel(Call_for_papersModel call_for_papers, CopyrightModel copyright, String timezone, String schedule_published_on, String type, String email, String privacy, String location_name, String logo, String code_of_conduct, int id, VersionModel version, String state, String organizer_description, String description, ArrayList<Social_linksModel> social_links, String topic, CreatorModel creator, String start_time, String end_time, String organizer_name, String background_image, String name) {

		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.email = email;
		this.privacy = privacy;
		this.location_name = location_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._version = version;
		this.state = state;
		this.organizer_description = organizer_description;
		this.description = description;
		this.social_links = social_links;
		this.topic = topic;
		this._creator = creator;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.name = name;

	}

}