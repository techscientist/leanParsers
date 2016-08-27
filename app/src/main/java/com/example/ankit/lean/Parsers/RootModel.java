import java.util.ArrayList;

class RootModel {

	public String name;
	public String timezone;
	public String schedule_published_on;
	public String description;
	public int id;
	public String state;
	public String start_time;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String background_image;
	public CreatorModel _creator;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public String location_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String type;
	public String privacy;
	public String organizer_name;
	public String email;

	public RootModel(String name, String timezone, String schedule_published_on, String description, int id, String state, String start_time, String topic, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String logo, String background_image, CreatorModel creator, String end_time, String organizer_description, String code_of_conduct, String location_name, CopyrightModel copyright, VersionModel version, String type, String privacy, String organizer_name, String email) {

		this.name = name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.logo = logo;
		this.background_image = background_image;
		this._creator = creator;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._copyright = copyright;
		this._version = version;
		this.type = type;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.email = email;

	}

}