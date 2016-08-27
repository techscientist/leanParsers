import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String name;
	public VersionModel _version;
	public String privacy;
	public String location_name;
	public String timezone;
	public String code_of_conduct;
	public String start_time;
	public String logo;
	public String background_image;
	public String end_time;
	public String type;
	public CreatorModel _creator;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public int id;
	public String description;
	public String topic;
	public String schedule_published_on;
	public String state;
	public String email;

	public RootModel(CopyrightModel copyright, String name, VersionModel version, String privacy, String location_name, String timezone, String code_of_conduct, String start_time, String logo, String background_image, String end_time, String type, CreatorModel creator, String organizer_description, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_name, int id, String description, String topic, String schedule_published_on, String state, String email) {

		this._copyright = copyright;
		this.name = name;
		this._version = version;
		this.privacy = privacy;
		this.location_name = location_name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.logo = logo;
		this.background_image = background_image;
		this.end_time = end_time;
		this.type = type;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.id = id;
		this.description = description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.email = email;

	}

}