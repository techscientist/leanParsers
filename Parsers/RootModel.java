import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public CreatorModel _creator;
	public String logo;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public int id;
	public String start_time;
	public String privacy;
	public String end_time;
	public String location_name;
	public String description;
	public String organizer_description;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public String state;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String email;

	public RootModel(String code_of_conduct, String organizer_name, String topic, CreatorModel creator, String logo, String timezone, ArrayList<Social_linksModel> social_links, String schedule_published_on, int id, String start_time, String privacy, String end_time, String location_name, String description, String organizer_description, String background_image, Call_for_papersModel call_for_papers, String name, String type, String state, VersionModel version, CopyrightModel copyright, String email) {

		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._creator = creator;
		this.logo = logo;
		this.timezone = timezone;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.start_time = start_time;
		this.privacy = privacy;
		this.end_time = end_time;
		this.location_name = location_name;
		this.description = description;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this.state = state;
		this._version = version;
		this._copyright = copyright;
		this.email = email;

	}

}