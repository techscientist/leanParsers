import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public String state;
	public VersionModel _version;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public CopyrightModel _copyright;
	public String background_image;
	public String organizer_name;
	public String schedule_published_on;
	public String timezone;
	public String start_time;
	public String description;
	public String email;
	public String topic;
	public String location_name;
	public String logo;
	public String code_of_conduct;
	public String end_time;
	public String organizer_description;
	public String type;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CreatorModel creator, String privacy, String state, VersionModel version, String name, ArrayList<Social_linksModel> social_links, int id, CopyrightModel copyright, String background_image, String organizer_name, String schedule_published_on, String timezone, String start_time, String description, String email, String topic, String location_name, String logo, String code_of_conduct, String end_time, String organizer_description, String type, Call_for_papersModel call_for_papers) {

		this._creator = creator;
		this.privacy = privacy;
		this.state = state;
		this._version = version;
		this.name = name;
		this.social_links = social_links;
		this.id = id;
		this._copyright = copyright;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.start_time = start_time;
		this.description = description;
		this.email = email;
		this.topic = topic;
		this.location_name = location_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this._call_for_papers = call_for_papers;

	}

}